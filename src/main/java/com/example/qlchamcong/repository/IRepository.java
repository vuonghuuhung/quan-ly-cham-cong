package com.example.qlchamcong.repository;

import java.util.List;

public interface IRepository<T> {
    void them(T item);
    void xoa(T item);
    void sua(T item);
    void capNhat(T item);
    List<T> layTatCa();
}
