package com.poly.users.service.Iplm;

import com.poly.users.entity.UserRole;
import com.poly.users.service.UserRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Override
    @Transactional
    public List<UserRole> getAll() {
        return null;
    }

    @Override
    @Transactional
    public UserRole getById(int UserRoleId) {
        return null;
    }

    @Override
    @Transactional
    public UserRole getByUserId(int UserRoleId) {
        return null;
    }

    @Override
    @Transactional
    public UserRole getByRoleId(int UserRoleId) {
        return null;
    }

    @Override
    @Transactional
    public UserRole save(UserRole userRole) {
        return null;
    }

    @Override
    @Transactional
    public UserRole update(UserRole userRole) {
        return null;
    }

    @Override
    @Transactional
    public UserRole delete(int id) {
        return null;
    }
}
