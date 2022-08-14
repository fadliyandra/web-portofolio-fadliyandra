package com.dibimbing1.dibimbing.service.impl;

import com.dibimbing1.dibimbing.model.Barang;
import com.dibimbing1.dibimbing.service.BarangServiceStatic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImplBarang implements BarangServiceStatic {
    static List<Barang> listBarang = new ArrayList<>();
    @Override
    public Barang save(Barang obj) {
        obj.setId(obj.getId());
        listBarang.add(obj);
        return obj;
    }

    @Override
    public Barang update(Barang obj) {
        for(Barang data : listBarang){
            if(obj.getId() == data.getId()){
                Barang update = new Barang();
                update.setNama(data.getNama());
                update.setId(data.getId());
                update.setSatuan(data.getSatuan());
                update.setStok(data.getStok());
                listBarang.remove(data);
                listBarang.add(update);
                return update;
            }
        }
        return null;
    }

    @Override
    public List<Barang> deleted(Long id) {
        for(Barang data : listBarang){
            if(id == data.getId()){
                Barang update = new Barang();
                update.setNama(data.getNama());
                update.setId(data.getId());
                update.setSatuan(data.getSatuan());
                update.setStok(data.getStok());
                listBarang.remove(data);

                return listBarang;
            }
        }
        return null;
    }

    @Override
    public List<Barang> dataMhs(int row,int page) {
        return listBarang;
    }

    @Override
    public Barang findById(long obj) {
        for(Barang data : listBarang){
            if(obj == data.getId()){
                return data;
            }
        }
        return null;
    }

}
