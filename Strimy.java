import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strimy {


    public static void main(String[] args) {
        final List<String> list = List.of("one", "two", "three");

        list.stream()
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() <= 3;
                })
                .map(s1 -> {
                    System.out.println("map: " + s1);
                    return s1.toUpperCase();
                })
                .forEach(x -> {
                    System.out.println("forEach: " + x);
                });
        /*
        Этот метод используется для создания нового потока, включающего только элементы,
         которые удовлетворяют определенному условию. В качестве аргумента метод принимает
         функциональный интерфейс Predicate, задающий условие фильтрации.

        Вот пример использования метода filter() для создания нового потока, который включает только
         четные числа из списка целых чисел.
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> evenNumbersStream = numbers.stream()
                .filter(n -> n % 2 == 0);

        evenNumbersStream.forEach(System.out::println); // prints 2, 4, 6, 8, 10


        /*
        Метод map() принимает в качестве аргумента функциональный интерфейс Function, задающий преобразование,
        применяемое к каждому элементу. Возвращаемый поток содержит преобразованные элементы.

        Метод map() возвращает новый поток. Он не изменяет исходный поток и коллекцию. Обычно он используется для
        выполнения операций, таких как преобразование элементов из одного типа в другой.

        В данном примере мы с помощью map() преобразовали строку в количество символов в строке,
        используя короткую запись лямбды (String::length), так называемую ссылку на метод.
         */

        List<String> words = Arrays.asList("apple", "banana", "orange", "peach");

        Stream<Integer> lengthsStream = words.stream()
                .map(String::length);

        lengthsStream.forEach(System.out::println); // prints 5, 6, 6, 5

        /*
        Метод flatMap() используется для создания одного потока из множества потоков. Он принимает функцию
        в качестве аргумента, которая применяется к каждому элементу исходного потока. Эта функция принимает
        элемент исходного потока и возвращает новый поток.
        В данном примере мы начинаем со списка списков целых чисел и создаем поток с помощью метода stream().
        Затем мы используем метод flatMap() для создания нового потока, включающего все целые числа из вложенных
         списков, путем применения метода stream() к каждому из вложенных списков. Наконец, мы используем
         метод forEach() для вывода каждого элемента нового потока.
         */
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        Stream<Integer> flattenedStream = listOfLists.stream()
                .flatMap(Collection::stream);

        flattenedStream.forEach(System.out::println); // prints 1, 2, 3, 4, 5, 6, 7, 8, 9
        /*
        Метод distinct() возвращает новый поток, содержащий только уникальные элементы исходного потока.
        Дубликаты определяются на основе их естественного порядка или с использованием переданного компаратора.

        Вот пример, в котором функция distinct() используется для удаления дубликатов из потока целых чисел:
         */
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 2, 1, 4, 5, 3, 5);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNumbers); // prints [1, 2, 3, 4, 5]

        /*
        Метод limit(n) возвращает новый поток, содержащий не более n элементов исходного потока.
        Если исходный поток содержит меньше n элементов, новый поток будет содержать все элементы исходного потока.
         */
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> limitedNumbers = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(limitedNumbers); // prints [1, 2, 3, 4, 5]
        /*
        Метод skip(n) возвращает новый поток, который содержит все элементы исходного потока,
        исключая первые n элементов.
        Если исходный поток содержит меньше n элементов, новый поток будет пустым.
         */
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> skippedNumbers = numbers.stream()
                .skip(5)
                .collect(Collectors.toList());

        System.out.println(skippedNumbers); // prints [6, 7, 8, 9, 10]

        /*
        Метод sorted() создает новый поток, содержащий элементы исходного потока,
        отсортированные в порядке возрастания.

        При вызове метода sorted() возвращается новый поток, содержащий те же элементы, что и исходный поток,
        но в отсортированном порядке.
         */
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames); // prints ["Alice", "Bob", "Charlie", "David"]
        /*
        Метод takeWhile() создает новый поток, содержащий элементы исходного потока до тех пор,
        пока они удовлетворяют указанному условию. Если первый элемент потока не соответствует предикату,
        новый поток будет пустым.
         */
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> takenNumbers = numbers.stream()
                .takeWhile(n -> n < 5)
                .collect(Collectors.toList());

        System.out.println(takenNumbers); // prints [1, 2, 3, 4]
        /*
        Метод dropWhile() возвращает новый поток, который включает все элементы исходного потока,
        начиная с первого элемента, не удовлетворяющего указанному условию.
        В момент, когда предикат возвращает false, все последующие элементы из исходного потока
        включаются в новый поток.
         */
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> droppedNumbers = numbers.stream()
                .dropWhile(n -> n < 5)
                .collect(Collectors.toList());

        System.out.println(droppedNumbers); // prints [5, 6, 7, 8, 9, 10]
        /*
        Метод peek() создает новый поток, идентичный исходному, но с дополнительной операцией,
        применяемой к каждому элементу при его прохождении по конвейеру потока.
        В данном примере, метод peek() применяется к потоку чисел. Consumer, переданный в метод peek(),
        выводит каждый элемент на консоль. В процессе этого, каждый элемент, проходя по конвейеру потока,
        отображается на консоли, но сам поток остается неизменным.
         */
        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
        /*
        Этот метод не рекомендуется использовать в продакшене, так как он не возвращает результат.
        Это означает, что у него может быть только побочный эффект. Например, если мы начинаем собирать
        данные с помощью метода forEach(), а затем кто-то применяет параллельное выполнение к стриму,
        мы тут же столкнемся со всеми проблемами синхронизации.

        public int getSum (Stream<Integer> s) {
	int [] sum = new int [1];
	s.forEach ( i -> sum [0] += i);
	return sum [0];
}
         */
/*
Этот метод часто используется в конвейере потока.
Его применяют для сбора результата потока в определенную структуру: строку, коллекцию (List, Set, Map).

Метод принимает объект типа Collector в качестве аргумента,
который определяет способ осуществления операции подсчета.
Класс Collectors содержит набор статических методов-коллекторов, которые упрощают выполнение общих операций,
таких как преобразование элементов в списки, множества и другие структуры данных.

Вот некоторые наиболее популярные методы класса Collectors:

toList(): Этот метод возвращает коллектор, который накапливает входные элементы в новый List.
toSet(): Этот метод возвращает коллектор, который накапливает входные элементы в новый Set.
joining(): Возвращает коллектор, который объединяет элементы потока в единую строку.
counting(): Возвращает коллектор, который подсчитывает количество элементов в потоке.
Вы можете быстро реализовать метод collect(Collector<? super T, A, R> collector) для сбора э
лементов в какую-то конкретную структуру.


        Stream<?> stream;
        List<?> list = stream.collect(Collectors.toList());

//Коллектор выше аналогичен данному коду
        list = stream.collect(
                () -> new ArrayList<>(), // определяем структуру
                (list, t) -> list.add(t), // определяем, как добавлять элементы
                (l1, l2) -> l1.addAll(l2) // и как объединять две структуры в одну
        );
*/
        /*
        Метод reduce() применяется для комбинирования элементов потока в одно значение.
        Он отличается от метода collect() тем, что использует ассоциативную функцию, принимающую два
        значения и объединяющую их в одно. Например, метод reduce() можно использовать для суммирования
        чисел или для нахождения максимального или минимального числа.

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
System.out.println(sum.get());
         */
        /*
        Метод findFirst() возвращает Optional<T> и служит для извлечения первого элемента из потока.
        Он обычно используется в сочетании с методом filter().
        Метод findAny() может оказаться полезным в ситуациях, когда вам нужно получить любой элемент из
        потока без конкретного предпочтения.

В отличие от findFirst(), который всегда возвращает первый найденный элемент потока, findAny(),
при параллельном выполнении потока, может возвращать любой элемент, поскольку выбор элемента зависит от того,
какой поток обработает его первым.

boolean anyMatch(Predicate)
Метод anyMatch(Predicate) используется для проверки, соответствует ли хотя бы один элемент потока
указанному предикату.

boolean allMatch(Predicate)
Возвращает true, если все элементы потока удовлетворяют предикату.
         */
        /*
        Чтобы сгруппировать данные по какому-нибудь признаку, нам надо использовать метод collect() и
        метод Collectors.groupingBy().
        Группировка списка рабочих по их должности (деление на списки)

 Map<String, List<Worker>> map1 = workers.stream()
       .collect(Collectors.groupingBy(Worker::getPosition));
Группировка списка рабочих по их должности (деление на множества)

Map<String, Set<Worker>> map2 = workers.stream()
      .collect(
      		Collectors.groupingBy(
            	Worker::getPosition, Collectors.toSet()
       		)
       );
Подсчет количества рабочих, занимаемых конкретную должность

Map<String, Long> map3 = workers.stream()
       .collect(
       		Collectors.groupingBy(
            	Worker::getPosition, Collectors.counting()
            )
       );
Группировка списка рабочих по их должности, при этом нас интересуют только имена

Map<String, Set<String>> map4 = workers.stream()
       .collect(
       		Collectors.groupingBy(
            	Worker::getPosition,
              	Collectors.mapping(
                	Worker::getName,
                    Collectors.toSet()
                )
            )
       );
Расчет средней зарплаты для данной должности

Map<String, Double> map5 = workers.stream()
       .collect(
       		Collectors.groupingBy(
            	Worker::getPosition,
              	Collectors.averagingInt(Worker::getSalary)
            )
       );
Группировка списка рабочих по их должности, рабочие представлены только именами единой строкой

Map<String, String> map6 = workers.stream()
       .collect(
       		Collectors.groupingBy(
            	Worker::getPosition,
              	Collectors.mapping(
                	Worker::getName,
                    Collectors.joining(", ", "{","}")
                )
            )
       );
Группировка списка рабочих по их должности и по возрасту.

Map<String, Map<Integer, List<Worker>>> collect = workers.stream()
       .collect(
       		Collectors.groupingBy(
            	Worker::getPosition,
              	Collectors.groupingBy(Worker::getAge)
            )
       );
         */
        }
    }



