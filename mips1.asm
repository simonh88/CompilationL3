.data
str_div_by_0:	.asciiz "ERREUR D'EXECUTION : Division par zero interdite" 
label_str_0:
.asciiz "Hello world\n"

.text
main :
move $s7,$sp
addi $sp, $sp, -8




li $v0, 4
la $a0, label_str_0
syscall



li $v0, 0

 sw $v0, 0($s7)



li $v0, 0

 sw $v0, -4($s7)



li $v0, 0
pour13: 

lw $v0, 0($s7)

addi $sp, $sp, -4
sw $v0, 0($sp)
li $v0, 2
lw $t8, 0($sp)
addi $sp, $sp, 4
slt $v0, $t8, $v0
beq $v0, $0, fpour13



lw $v0, 0($s7)


move $a0, $v0

li $v0, 1

syscall


lw $v0, 0($s7)

addi $sp, $sp, -4
sw $v0, 0($sp)
li $v0, 1
lw $t8, 0($sp)
addi $sp, $sp, 4
add $v0, $t8, $v0
j pour13
fpour13: 
end :
move $v1, $v0
li $v0, 10
syscall

print_exception_div_zero:
li $v0, 4
la $a0, str_div_by_0
syscall
b end

