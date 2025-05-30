package com.procurementsystem.procurementsystem.service.impl;

import com.procurementsystem.procurementsystem.dto.UserRequest;
import com.procurementsystem.procurementsystem.dto.UserResponse;
import com.procurementsystem.procurementsystem.model.Device;
import com.procurementsystem.procurementsystem.model.User;
import com.procurementsystem.procurementsystem.repository.DeviceRepository;
import com.procurementsystem.procurementsystem.repository.UserRepository;
import com.procurementsystem.procurementsystem.service.UserHandlerService;
import com.procurementsystem.procurementsystem.service.UserService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final DeviceRepository deviceRepository;
    private final UserHandlerService userHandlerService;
    private final ModelMapper modelMapper;
    public UserServiceImpl(UserRepository userRepository,
                           DeviceRepository deviceRepository,
                           UserHandlerService userHandlerService,
                           ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.deviceRepository = deviceRepository;
        this.userHandlerService = userHandlerService;
        this.modelMapper = modelMapper;
    }
    @Transactional
    @Override
    public UserResponse create(UserRequest userRequest) {
        userHandlerService.usernameHasText(userRequest.getUsername());
        userHandlerService.phoneNumberHasText(userRequest.getPhoneNumber());
        User user = modelMapper.map(userRequest, User.class);
        user.setDateOfBirth(userHandlerService.convertStringToDate(userRequest.getDateOfBirth()));
        log.info("User created: {}", user);
        userRepository.saveAndFlush(user);

        if(user.getId()!=null){
            final UserRequest.DeviceRequest deviceRequest = userRequest.getDeviceRequest();
            Device device =new Device();
            device.setDeviceId(deviceRequest.getDeviceId());
            device.setDeviceModel(deviceRequest.getDeviceModel());
            device.setDeviceType(deviceRequest.getDeviceType());
            device.setOsVersion(deviceRequest.getOsVersion());
            device.setTrustDevice(deviceRequest.isTrustDevice());
            device.setStatus(deviceRequest.getStatus());
            device.setUser(user);
            deviceRepository.save(device);
            }
        return null;
    }
    @Transactional
    @Override
    public UserResponse update(Long id, UserRequest userRequest) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            log.info("User with id {} request update info but not found in DB", id);
            this.create(userRequest);
            return null;
        }
        User userUpdate =user.get();
        userUpdate.setUsername(userRequest.getUsername());
        userRepository.saveAndFlush(userUpdate);
        return null;
    }

    @Override
    public UserResponse findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<UserResponse> findAll() {
        return List.of();
    }
}
