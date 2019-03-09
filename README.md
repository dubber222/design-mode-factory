
###产品族和产品等级结构
以book为例，包括电纸书、纸质书， 《设计模式》书籍、《文学》书籍
这里我以 《设计模式》、《文学》为产品族； 电纸书、纸质书为产品等级。
语义上不是很合理，应该反过来，比较符合常识。 但不耽误理解产品族和产品等级的概念

###1、简单工厂模式
通过工厂创建对象，对于调用者来说是黑箱操作，不需要了解到创建对象的过程。
简单工厂模式：一个工厂生产出客户需要的所有产品。

缺点：不易扩展，不符合`开闭原则`和`单一原则`。


###2、工厂方法模式
如果工厂类生产的对象，每一个对象生成的逻辑不一致，则需要创建工厂类的子工厂类。

###3、抽象工厂模式
抽象一类对象为一个产品族（产品工厂）。
