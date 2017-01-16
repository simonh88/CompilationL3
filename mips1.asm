.text
main :
move $s7,$sp
li $v0, 6
addi $sp, $sp, -4
sw $v0, 0($sp)
li $v0, 2
lw $t8, 0($sp)
addi $sp, $sp, 4
sub $v0, $t8, $v0
addi $sp, $sp, -4
sw $v0, 0($sp)
li $v0, 15
addi $sp, $sp, -4
sw $v0, 0($sp)
li $v0, 5
lw $t8, 0($sp)
addi $sp, $sp, 4
sub $v0, $t8, $v0
lw $t8, 0($sp)
addi $sp, $sp, 4
add $v0, $t8, $v0

end :
move $v1, $v0
li $v0, 10
syscall