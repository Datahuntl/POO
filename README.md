# POO

## Unified Model Language (UML)

![image](https://github.com/user-attachments/assets/6e931d42-e9a8-4723-8ce6-88c027ebfff9)

![image](https://github.com/user-attachments/assets/5f1507c3-87ca-4fe4-bdf0-bf6663e9cd05)

![image](https://github.com/user-attachments/assets/b36deafd-d3bf-439b-8b47-c896ce9860c7)

![image](https://github.com/user-attachments/assets/a43a0d9d-9bf1-4d6a-ab85-6ae106dd6672)


reference:
https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-class-diagram-tutorial/

## Association/Aggregation/Composition

![image](https://github.com/user-attachments/assets/971de66d-2ecc-4eb6-a80f-dd37b4c947bc)

https://data-flair.training/blogs/association-in-java/

### Association

The association relationship indicates that a class knows about another class. It can be described as a “has-a” relationship between classes. The relationship between the classes can be bi-directional.

For example, if we talk about the association between a teacher and a student, multiple students can associate with a single teacher and a single student is also associated with multiple teachers but both can be created or deleted independently. So, when a teacher leaves the school, we don’t need to remove any students, and when a student leaves the school, we don’t need to remove any teachers.

Aggretation is when the student can exist without the teacher.
Composition is when the student can only exist with the teacher

![image](https://github.com/user-attachments/assets/72abca30-0423-411d-b854-1a2a17a14bfe)


So, in the above example, the teacher has many students and vice versa, connectes to various objects. Thus, we can say the association in Java follows a many-to-many relationship.

```

```

### Agregation

```
public class Conta {
  //Membros da Classe
  int numero;
  float saldo;
  float limite;
  Cliente titular;
}

public class Cliente {
  String nome;
  String endereco;
  String cpf;
}

public class Main {
 public static void main(String[] args) {
    Conta conta = new Conta();
    Cliente cliente = new Cliente();

    conta.titular = cliente;
  }
}
```

![image](https://github.com/user-attachments/assets/86b3aa39-4190-46e7-ab28-424f218ebc70)


### Composition

```
public class Empresa {
  String nome;
  Departamento dep;

  public Empresa() {
    dep = new Departamento();
  }
}


```
