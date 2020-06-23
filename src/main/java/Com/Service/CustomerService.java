package Com.Service;

import Com.Model.Customer;
import Com.Repositiory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements iService<Customer> {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
