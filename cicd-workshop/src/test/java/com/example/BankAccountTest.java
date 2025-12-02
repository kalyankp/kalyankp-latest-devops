package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    
    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance());
    }
}
