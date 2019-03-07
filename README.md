# gateway
```
CREATE TABLE `jwt_token` (
  `token` varchar(255) NOT NULL,
  PRIMARY KEY (`token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `active` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `is_enabled` bit(1) NOT NULL,
  `is_expired` bit(1) NOT NULL,
  `is_loacked` bit(1) NOT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_roles` (
  `user_id` varchar(255) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO test.`role`
(id, `role`)
VALUES(1, 'admin');

INSERT INTO test.`user`
(id, active, email, is_enabled, is_expired, is_loacked, last_name, name, password)
VALUES('1', 1, 'demo@example.com', 1, 0, 0, 'example', 'demo', '$2a$12$Ss0cEpFonkcg3f3MiHvIZO8FdumaD5Q.AVmANPXTib2SagSAz1XOK');

INSERT INTO test.user_roles
(user_id, role_id)
VALUES('1', 1);
```

email=demo@example.com
password=password