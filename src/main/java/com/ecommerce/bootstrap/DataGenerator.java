package com.ecommerce.bootstrap;

import com.ecommerce.entity.Address;
import com.ecommerce.entity.Balance;
import com.ecommerce.entity.Customer;
import com.ecommerce.repository.AddressRepository;
import com.ecommerce.repository.BalanceRepository;
import com.ecommerce.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    private final AddressRepository addressRepository;
    private final BalanceRepository balanceRepository;
    private final CustomerRepository customerRepository;

    public DataGenerator(AddressRepository addressRepository, BalanceRepository balanceRepository, CustomerRepository customerRepository) {
        this.addressRepository = addressRepository;
        this.balanceRepository = balanceRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Customer> customerList = new ArrayList<>();

        Customer c1 = new Customer("Ali","Yazar","ayazar@zep.com","ayzar1");
        Customer c2 = new Customer("Veli","Bozar","vbozar@zep.com","bozo5");
        Customer c3 = new Customer("Hope","Drop","hdrop@mas.com","hodrpza");
        Customer c4 = new Customer("Wins","Smiles","wsmiles@pot.com","smiley");

        Address a1 = new Address("A1","HappyHome","1Str","52687");
        Address a2 = new Address("A2","Help Rd","5 Ave","12687");
        Address a3 = new Address("A3","Windamm","Rd 67","24587");

        Balance b1 = new Balance(BigDecimal.valueOf(58.98));
        Balance b2 = new Balance(BigDecimal.valueOf(47.00));
        Balance b3 = new Balance(BigDecimal.valueOf(74.41));
        Balance b4 = new Balance(BigDecimal.valueOf(19.99));
        Balance b5 = new Balance(BigDecimal.valueOf(124.50));
        Balance b6 = new Balance(BigDecimal.valueOf(200.00));
        Balance b7 = new Balance(BigDecimal.valueOf(17.18));

       // customerList.addAll(Arrays.asList(c1,c2,c3,c4));
        customerRepository.save(c1);
        customerRepository.save(c2);
        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);

        c1.setAddressList(Arrays.asList(a1));
        c2.setAddressList(Arrays.asList(a2,a3));
        c1.setBalance(b1);
        c2.setBalance(b6);

    }
}
