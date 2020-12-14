/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.dao.tienich.JdbcHelper;
import com.edusys.entity.ChuyenDe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



 public class ChuyenDeDAO {

        public void insert(ChuyenDe model) {
            String sql = "INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?, ?, ?, ?, ?, ?)";
            JdbcHelper.executeUpdate(sql, model.getMaCD(), model.getTenCD(), model.getHocPhi(), model.getThoiLuong(), model.getHinh(), model.getMoTa());
        }

        public void update(ChuyenDe model) {
            String sql = "UPDATE ChuyenDe SET TenCD=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? WHERE MaCD=?";
            JdbcHelper.executeUpdate(sql, model.getTenCD(), model.getHocPhi(), model.getThoiLuong(), model.getHinh(), model.getMoTa(), model.getMaCD());
        }

        public void delete(String MaCD) {
            String sql = "DELETE FROM ChuyenDe WHERE MaCD=?";
            JdbcHelper.executeUpdate(sql, MaCD);
        }

        public List<ChuyenDe> select() {
            String sql = "SELECT * FROM ChuyenDe";
            return select(sql);
        }

        public ChuyenDe findById(String macd) {
            String sql = "SELECT * FROM ChuyenDe WHERE MaCD=?";
            List<ChuyenDe> list = select(sql, macd);
            return list.size() > 0 ? list.get(0) : null;
        }

        private List<ChuyenDe> select(String sql, Object... args) {
            List<ChuyenDe> list = new ArrayList<>();
            try {
                ResultSet rs = null;
                try {
                    rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                        ChuyenDe model = readFromResultSet(rs);
                        list.add(model);
                    }
                } finally {
                    rs.getStatement().getConnection().close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            return list;
        }

        private ChuyenDe readFromResultSet(ResultSet rs) throws SQLException {
            ChuyenDe model = new ChuyenDe();
            model.setMaCD(rs.getString("MaCD"));
            model.setHinh(rs.getString("Hinh"));
            model.setHocPhi(rs.getDouble("HocPhi"));
            model.setMoTa(rs.getString("MoTa"));
            model.setTenCD(rs.getString("TenCD"));
            model.setThoiLuong(rs.getInt("ThoiLuong"));
            return model;
        }
    }
