package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.ReceiptStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tbl_deliveryReceipt")
public class DeliveryReceipt extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryReceiptId;
    private Date deliveryDate;
    private String deliveryNoteNumber;
    private double deliveryAmount;
    private Date receiptDate;
    private ReceiptStatus receiptStatus;
    private String remarkDelivery;
    private Long contractId;
}
