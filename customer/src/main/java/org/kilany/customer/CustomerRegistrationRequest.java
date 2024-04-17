package org.kilany.clients.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
