package com.jakubartlomiej.findyourfriends.user.service;

import com.jakubartlomiej.findyourfriends.user.domain.Role;
import com.jakubartlomiej.findyourfriends.user.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    public void save(Role role) {
        roleRepository.save(role);
    }
}
