.text
main :
move $s7,$sp
li $v0, 2
neg $v0, $t8

end :
move $v1, $v0
li $v0, 10
syscall