insert into INSTITUICAO (id, nome)
values (1, 'BANCO GEN1'),
    (2, 'BANCO GEN2');
insert into CLIENTE (id, cpf, nome)
values (1, '50373584342', 'JOAO DA SILVA'),
    (2, '52258570271', 'RENATA DOURADO'),
    (3, '52258570270', 'MARIO PEIXOTO'),
    (4, '52258570274', 'MABEL DA SILVA'),
    (5, '52258570275', 'JULCE DOS SANTOS'),
    (6, '52258570277', 'PELE DOS SANTOS');
insert into CONTA (
        id,
        agencia,
        num_conta,
        cliente_id,
        instituicao_id
    )
values (1, '1024', '300120', 1, 1),
    (2, '1024', '300121', 2, 2),
    (3, '1024', '300122', 3, 1),
    (4, '1024', '300123', 4, 2),
    (5, '1024', '300124', 5, 1),
    (6, '1024', '300125', 6, 2);
insert into FAVORECIDO (id, cliente_id, conta_id, ativo)
values (1, 1, 2, true),
    (2, 1, 3, true),
    (3, 1, 4, true),
    (4, 1, 5, true);