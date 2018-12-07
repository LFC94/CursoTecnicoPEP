SELECT aluno, turma, disciplina, n1, f1 FROM  boletim
WHERE aluno="Medeiros" 
ORDER BY n1 DESC;
/* a)*/
SELECT aluno, turma, disciplina, nt, ft FROM  boletim;
/* b)*/
SELECT aluno, turma, disciplina, nt, ft FROM  boletim
ORDER BY aluno;
/* c)*/
SELECT aluno, turma, disciplina, nt, ft FROM  boletim
WHERE aluno="Maria";
/* d)*/
SELECT aluno, turma, disciplina, nt, ft FROM  boletim
WHERE disciplina="Matematica";
/* e)*/
SELECT aluno, turma, disciplina, nt, ft FROM  boletim 
WHERE disciplina!="Portugues";
 
/* f)*/
SELECT aluno, nt FROM  boletim
WHERE disciplina="Ingles" AND nt>80 ;

SELECT aluno,disciplina, nt FROM  boletim 
WHERE disciplina="Matematica" AND nt<50 OR disciplina="Portugues" AND nt<50;



