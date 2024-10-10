package oopsExamples;

import java.util.Scanner; //Importing Scanner Class
/*-----------------------------------1.Custom Exception-----------------------------------*/
class SimpleInterestRateException extends Exception 
{
	SimpleInterestRateException(String msg) 
	{
		super(msg);
	}
}
/*-----------------------------------2.Custom Exception-----------------------------------*/
class SimpleInterestTimeException extends Exception
{
	SimpleInterestTimeException(String msg) 
	{
		super(msg);
	}
}
/*-----------------------------------3.Custom Exception-----------------------------------*/
class SimpleInterestPrincipalException extends Exception 
{
	SimpleInterestPrincipalException(String msg) 
	{
		super(msg);
	}
}
/*-----------------------Simple calculator class-----------------------*/
class SimpleInterestCal 
{
	double rate, time, principal; /*Member variables*/
	SimpleInterestCal() /*Constructor*/
	{
		Scanner sc = new Scanner(System.in); /*Object for Scanner class*/

		// Input section
		System.out.print("Enter Principal Amount: ");
		principal = sc.nextDouble();

		System.out.print("Enter Rate: ");
		rate = sc.nextDouble();

		System.out.print("Enter Time: ");
		time = sc.nextDouble();
		sc.close();
	}
	/*-----------method for display details-----------*/
	public void displayInterestDetails() 
	{
		System.out.println("The rate is: " + rate);
		System.out.println("The time is: " + time);
		System.out.println("The principal is: " + principal);
	}
	/*-----------method for Calculate interest-----------*/
	public void calInterest() 
	{
		try /*-----------Implementing in Try block(With all Exceptions)-----------*/
		{
			if (rate < 0) 
			{
				throw new SimpleInterestRateException("Rate can't be negative.");
			}
			if (time < 0) 
			{
				throw new SimpleInterestTimeException("Time can't be negative.");
			}
			if (principal < 0) 
			{
				throw new SimpleInterestPrincipalException("Principal can't be negative.");
			}
			// Calculate simple interest
			double interest = (principal * rate * time) / 100;
			System.out.println("The Principal amount: " + principal);
			System.out.println("The Rate of interest: " + rate + "%");
			System.out.println("The Time period: " + time + " years");
			System.out.println("The Simple Interest: " + interest);
		} 
		/*From catching all Excpetions*/
		catch (SimpleInterestRateException obj) 
		{
			System.err.println("Interest Rate Exception: " + obj);
		} 
		catch (SimpleInterestTimeException obj) 
		{
			System.err.println("Time Exception: " + obj);
		} 
		catch (SimpleInterestPrincipalException obj) 
		{
			System.err.println("Principal Exception: " + obj);
		}
		/*------------------------------2nd Approach------------------------------*/
		/*
		 catch (SimpleInterestRateException | SimpleInterestTimeException | SimpleInterestPrincipalException obj)
		{
			System.err.println("Principal Exception: " + obj);
		}
		*/
	}
}
/*--------------------Main class--------------------*/
public class SimpleInterestExceptionHandle 
{
	/*--------------------main Methoddd--------------------*/
	public static void main(String[] args) 
	{
		SimpleInterestCal interestObj = new SimpleInterestCal(); /*Object Creating*/
		/*--------------------Calling Methods--------------------*/
		interestObj.displayInterestDetails();
		interestObj.calInterest();
	}
}
