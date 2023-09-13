package org.Srvnnn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private Person person;

    @Autowired
    private Address address;

    @GetMapping("/api/get-person")
    public String getPersonAndSendEmail() {

        String personJson = person.toString();

        emailService.sendEmail("saravanasaro2410@gmail.com", "Person and Address Info", personJson);

        System.out.println("Mail Sent Successfully");

        return personJson;
    }

    @PostMapping("/api/update-person")
    public String updatePerson(@RequestBody Person userInput) {

        person.setName(userInput.getName());
        person.getAddress().setStreet(userInput.getAddress().getStreet());
        person.getAddress().setCity(userInput.getAddress().getCity());

        return "Person updated successfully";
    }
}

