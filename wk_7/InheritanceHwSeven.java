/*
  Student:
    s15 Laura Kirby

  Usage:
    java InheritanceHwSeven

  Application description:
    - Write a program in which you create a class,
      a subclass of that class, and a demo class with main.
      - The subclass must:
        1. override a method inherited from its immediate superclass and
        2. use the keywords this and super to make use of both versions of the overridden method

    See the HouseBoat class and build method in lesson 7 class notes.

    Examples:
    The IncomeTax class has a calculate method that accepts an integer and returns a double.
    If FederalIncomeTax and StateIncomeTax are subclasses of IncomeTax, both subclasses can
    call both this.calculateTax() and super.calculateTax() and each subclass might override
    the inherited method in a different way.

    Note that StateIncomeTax is NOT a subclass of FederalIncomeTax because the state level
    is NOT related to the federal level. For example, California has a state income tax that
    can be higher than an individual's federal income tax, while Texas and Florida have no
    state income tax.

    If SpecialAccount is a subclass of Account, a method in the subclass might call
    this.getInterest(isChecking) and super.getInterest(isChecking).
    The class with main should not be a subclass of any class. It is the executive that
    orchestrates the flow of calls. The main method must show the results of the method calls.
    The main method is also our "unit test" to see what we defined in the other classes works
    as we expect.

    Optional challenges:
    -- Use this. and super. to reference fields or super() or super(arg) to call a constructor.
    -- Use the keyword final (which exists at three levels, class, method, local variable)
    -- Use an abstract class

    A possible scenario:
    (1) Write an abstract class, AbstractRestaurant, with both an abstract method,
    calculateTax() and a non-abstract method, getPretaxPrice().
    (2) Write a subclass of the abstract class, Restaurant, named NewYorkStateRestaurant, and make NewYorkStateRestaurant implement calculateTax() with the rate of 4.0%.
    (3) Write a subclass of NewYorkStateRestaurant named NewYorkCityRestaurant that overrides calculateTax() such that this.calculateTax() charges 12.875%. Call both this.calculateTax() and super.calculateTax(). Note that New York official tax rates change periodically and are posted at http://ny.rand.org/stats/govtfin/salestax.html)



*/

