package ru.itmentor.spring.boot_security.demo.service;

import org.springframework.transaction.annotation.Transactional;
import ru.itmentor.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    @Transactional(readOnly = true)
    List<Role> allRole();

    @Transactional
    Role getRoleById(Long id);

    @Transactional
    Set<Role> getRole(List<String> rolesId);
}
