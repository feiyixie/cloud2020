package com.mj.springcloud.controller;

import com.mj.springcloud.entities.CommonResult;
import com.mj.springcloud.entities.Payment;
import com.mj.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
         int result = paymentService.create(payment);
         log.info("插入结果{}",result);
         if (result>0){
             return new CommonResult(200,"成功！",result);
         }else {
             return new CommonResult(400,"成功！",null);
         }
    }

    @GetMapping(value = "/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果{}",payment.toString());
        if (payment != null){
            return new CommonResult(200,"查询成功！",payment);
        }else {
            return new CommonResult(400,"没有对应记录！，查询记录：{}",id);
        }
    }
}
