def only_parentheses(chars: List[Char]): List[Char] =
  chars.filter(is_parentheses)

def is_parentheses(c: Char): Boolean =
  if (c == '(' || c == ')') true else false

def rem_outer_chars(chars: List[Char]): List[Char] =
  chars.tail.reverse.tail

def is_balanced(pars: List[Char]): Boolean =
  if (pars.length % 2 != 0)
    false
  else if pars.isEmpty
    true
  else false


is_parentheses('(')
is_parentheses(')')
is_parentheses('f')

only_parentheses(List('a', 'b', 'c'))
only_parentheses(List('(', 'a', 'b', 'c', ')'))

rem_outer_chars(List('a', 'b', 'c'))


//if(chars.head == '(' || chars.last == ')')
