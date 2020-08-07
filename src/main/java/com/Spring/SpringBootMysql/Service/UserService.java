package com.Spring.SpringBootMysql.Service;


import com.Spring.SpringBootMysql.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public interface UserService {

    User findBymemberID(Long memberID);

    User findByemailId(String emailId);

    User save(User user);

    User addMember(User user);

    List<User> findAll();
}
