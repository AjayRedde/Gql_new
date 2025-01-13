package lec05.service;

import lec05.dto.Address;
import lec05.dto.Customer;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class AddressController {

    @SchemaMapping
    public Mono<Address> address(Customer customer){
        return Mono.just(
                Address.create(customer.getName() + " street", customer.getName() + " city" )
        );
    }

}