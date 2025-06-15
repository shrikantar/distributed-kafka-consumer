package com.ctcs.kafka_consumer.controller;

import com.ctcs.kafka_producer.model.Invoice;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "invoice-topic", groupId = "invoice-group")
    public void consume(Invoice invoice) {
        System.out.println("Received Invoice:");
        System.out.println("Invoice Number: " + invoice.getInvoiceNumber());
        System.out.println("Due Date: " + invoice.getDueDate());
        System.out.println("Vendor Code: " + invoice.getVendorCode());
        System.out.println("Amount: " + invoice.getAmount());
    }
}
