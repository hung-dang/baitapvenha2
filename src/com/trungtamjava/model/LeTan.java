/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungtamjava.model;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LeTan {

    public static double luongLeTan(double soGio) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so gio lam cua le tan : ");
        soGio = sc.nextDouble();
        double luong = soGio * 100000;
        return luong;
    }
}
