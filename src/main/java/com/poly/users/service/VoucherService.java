package com.poly.users.service;

import com.poly.users.DTO.VoucherDto;
import com.poly.users.entity.Voucher;

import java.util.List;

public interface VoucherService {
    List<VoucherDto> getAll();
    //lay ra voucher sap hoat dong
    List<Voucher> getByDate(String date);
    List<Voucher> getStatus(String status);
    Voucher getByCode(String code);
    VoucherDto save(VoucherDto voucherDto);
    Voucher delete(int id);
}
