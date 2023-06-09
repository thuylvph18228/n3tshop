package com.poly.users.service;

import com.poly.users.entity.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> getAll();
    Notification save(Notification notification);
    Notification update(Notification notification);
    Notification delete(int id);
}
