package ua.edu.ucu.apps.FlowerStoreWeb.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.FlowerStoreWeb.Payment.CreditCard;
import ua.edu.ucu.apps.FlowerStoreWeb.Payment.PayPal;
import ua.edu.ucu.apps.FlowerStoreWeb.Payment.Payment;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/payment")
public class PaymentController {
        @GetMapping
        public List<? extends Payment> getPayment() {
            return Arrays.asList(new CreditCard(), new PayPal());
        }
    }
