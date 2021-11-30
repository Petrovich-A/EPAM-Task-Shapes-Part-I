# Task Shapes

## Необходимо написать приложениеи тесты к немусогласно требованиям, приведенным  ниже.  В  приложении  должнабыть  реализована функциональность, определенная индивидуальным заданием
```
* Разработать entity-классы, например: «Разработать классы Точка и Фигура»* Entity-классы  не  следует  наполнятьметодами,  выполняющими  функциональные действия (методами бизнес-логики, такими как вычисление, поиск и т.д.).

* Фигура должна содержать поле idили name.

* Разработать action-классы реализующие  заданные  функциональности,  например: «Реализовать методы вычисления площади и периметра фигуры»

* Параметры, необходимые для создания объектов, читатьиз файла (.txt).Часть данных должна  бытьнекорректной.Если  встретилась некорректная  строка,  приложение должно переходить к следующей строке.Файлынедолжны находиться вне каталогов.
* Для  чтенияинформациииз  файла  использовать тольковозможности,  появившиеся  в Java8.

* Разработать классы-валидаторыдля проверки результатов вычислений параметров фигур, а также для валидацииисходныхданных для создания объектов entity-классов.

Например: корректнаястрока  в  файле  для  создания  объекта Круг: «1.0 2.0 3.0», где первое второе – координаты центра, третье -радиус круга; некорректнаястрока в файле для создания объекта Круг:«2a.0 3.04.1» - недопустимый символ«z»,  всю  строку  следует  считать  некорректной  здесь  и  в  случаях  приведенных ниже;некорректнаястрока  в  файле  для  создания  объекта Круг: «1.0  2.0» - недостаточно информации для создания объекта(можно использовать значение по умолчанию, н-р: 1);некорректнаястрока в файле для создания объекта Круг:«1.0  2.0 -3.0»-невозможно создать Круг с отрицательным радиусом.

* Для  классов-сущностей  следуетпереопределять  методы  класса Object: toString(), equals(), hashCode().Методы класса Objects использоватьнельзя.

* При решении задачидля создания entity-классовиспользовать паттернFactoryMethod.
* Все классыприложения должны быть структурированы по пакетам.

* Использовать собственные классы исключительных ситуаций.* Оформление кодадолжно соответствовать JavaCodeConvention.

* Для записи логов использовать Log4J2(SLF4J).Логи писать следует в консоль и в файл.

* Код должен быть покрыт Unit-тестами. Использовать TestNG(JUnit).Принаписании тестовзапрещено:создавать неаннотированные методы, писать логи и использовать операторы ветвления:if, for, while, do\while, switch; использовать в тест-методе более одного Assert-метода.
```


