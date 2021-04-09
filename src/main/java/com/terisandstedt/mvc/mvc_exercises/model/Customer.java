package com.terisandstedt.mvc.mvc_exercises.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

public class Customer {

    private final UUID customerId;

    @NotEmpty(message = "{Customer.name}")
    private String name;

    @NotEmpty(message = "{Customer.email}")
    @Email(message = "{Customer.emailFormat}")
    private String email;

    @NotNull
    private LocalDate regDate;

    @NotNull
    private boolean active;

    @NotNull
    private CustomerDetails details;

    public Customer() {
        customerId = UUID.randomUUID();
        regDate = LocalDate.now();
        active = true;
        details = new CustomerDetails();
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public CustomerDetails getDetails() {
        return details;
    }

    public void setDetails(CustomerDetails details) {
        this.details = details;
    }
}
