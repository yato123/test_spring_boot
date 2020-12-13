package com.example.testspringboot.controller.study;

import com.example.testspringboot.controller.aop.*;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Proxy;

@RestController
public class HelloController {
//    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

//    @GetMapping("/hi")
//    @ResponseBody
    public int countBudge(String budgetType){
        return this.getBudget(budgetType).count();
    }

    private Budget getBudget(String budgetType){


        //String className = getClassName(budgetType);
        String className = "ItBuget";
        Class budgetClass = null;
        Budget budget = null;
        try {
            budgetClass = Class.forName("com.example.testspringboot.controller.aop."+className);
            //BudgetHandler budgetHandler = new BudgetHandler((Budget)budgetClass.newInstance());
            Budget hrBudget = (Budget)budgetClass.newInstance();
            BudgetHandler budgetHandler = new BudgetHandler(hrBudget);
            budget = (Budget)Proxy.newProxyInstance(
                    budgetHandler.getClass().getClassLoader(),
                    hrBudget.getClass().getInterfaces(),
                    budgetHandler
            );
            System.out.println(budget.count());
        } catch(Exception e){
            e.printStackTrace();
        }
        //this.countBudge(BudgeEum.HR_BUDGE);
        return budget;
    }

    private int countBudge(BudgeEum budgetType){
        BudgetClass budgetClass = new BudgetClass();
        if(budgetType.equals(BudgeEum.HR_BUDGE)){
            return budgetClass.hRcount();
        } if(budgetType.equals(BudgeEum.IT_BUDGE)){
            return budgetClass.itCount();
        }if(budgetType.equals(BudgeEum.IT_BUDGE)){
            return budgetClass.fianceCount();
        } else {

        }
        return 0;
    }

    public static void main(String[] args) {
        String className = "HrBudget";
        Class budgetClass = null;
        try {
            budgetClass = Class.forName("com.example.testspringboot.controller.aop."+className);
           // BudgetHandler budgetHandler = new BudgetHandler((Budget)budgetClass.newInstance());
            Budget hrBudget = (Budget)budgetClass.newInstance();
            BudgetHandler budgetHandler = new BudgetHandler(hrBudget);
            Budget budget = (Budget)Proxy.newProxyInstance(
                    budgetHandler.getClass().getClassLoader(),
                    hrBudget.getClass().getInterfaces(),
                    budgetHandler
            );
            System.out.println(budget.count());
        } catch(Exception e){
            e.printStackTrace();
        }
    }




}
