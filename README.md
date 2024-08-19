
# Cadastro de Funcionários

Este projeto, realizado durante o segundo semestre do segundo ano do curso de Ciência da Computação, tem como objetivo aprimorar as habilidades de desenvolvimento de interfaces gráficas utilizando Java. O foco principal está na criação e organização de layouts complexos, utilizando componentes do Swing e técnicas avançadas de layout, como o GridBagLayout, para construir interfaces de usuário bem estruturadas e visualmente agradáveis.

O projeto inclui a implementação de diferentes abas e a organização de campos em painéis agrupados, com ajustes de fontes e espaçamentos para melhorar a usabilidade e a experiência do usuário.


## API Reference

#### JButton

```java
  JButton button = new JButton("Click Me");
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `text`    | `String` | **Optional**. O texto a ser exibido no botão. |
| `icon`    | `Icon`   | **Optional**. O ícone a ser exibido no botão. |

#### Methods

```java
  void addActionListener(ActionListener l)
```

| Parameter   | Type               | Description                        |
| :---------- | :----------------- | :--------------------------------- |
| `l`         | `ActionListener`   | **Required**. O ouvinte de ação que será notificado quando o botão for clicado. |

```java
  void setText(String text)
```

| Parameter   | Type               | Description                        |
| :---------- | :----------------- | :--------------------------------- |
| `text`      | `String`           | **Required**. O texto a ser exibido no botão. |

```java
  String getText()
```

| Parameter   | Type               | Description                        |
| :---------- | :----------------- | :--------------------------------- |
| `-`         | `-`                | Retorna o texto exibido no botão.  |

```java
  void setIcon(Icon icon)
```

| Parameter   | Type               | Description                        |
| :---------- | :----------------- | :--------------------------------- |
| `icon`      | `Icon`             | **Required**. O ícone a ser exibido no botão. |

```java
  Icon getIcon()
```

| Parameter   | Type               | Description                        |
| :---------- | :----------------- | :--------------------------------- |
| `-`         | `-`                | Retorna o ícone exibido no botão.  |

```java
  void setEnabled(boolean enabled)
```

| Parameter   | Type               | Description                        |
| :---------- | :----------------- | :--------------------------------- |
| `enabled`   | `boolean`          | **Required**. Define se o botão está habilitado ou desabilitado. |

```java
  boolean isEnabled()
```

| Parameter   | Type               | Description                        |
| :---------- | :----------------- | :--------------------------------- |
| `-`         | `-`                | Retorna `true` se o botão estiver habilitado, `false` caso contrário.  |

#### Events

```java
  ActionEvent
```

| Parameter   | Type               | Description                        |
| :---------- | :----------------- | :--------------------------------- |
| `event`     | `ActionEvent`      | Disparado quando o botão é clicado. |
