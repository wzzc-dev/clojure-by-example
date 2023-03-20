# Clojure

## 宏

> Io一章中我们讨论过这个问题。绝大多数语言会先执行参数，再把结果放到调用栈上。但是
这个例子里，我们不希望对代码块进行求值，除非条件为假。在Io中，语言通过延迟执行unless
消息规避了这个问题。在Lisp中，我们可以使用宏。当输入(unless test body)时，我们想让
Lisp将其翻译成(if (not test) body)，这时宏就派上用场了。
Clojure程序的执行分为两个阶段。宏展开（macro expansion）阶段将语言里的所有宏翻译成
其展开形式。你可以用命令macroexpand观察宏展开。我们已经用过几个宏了，它们都叫做宏读
取器。分号（;）表示注释，单引号（'）表示引用，而数学符号（#）则表示匿名函数。为了避
免早于预期执行，在想展开的表达式前面加上一个引号：

```clj
(defmacro unless [test body]  
 (list 'if (list 'not test) body)
```
