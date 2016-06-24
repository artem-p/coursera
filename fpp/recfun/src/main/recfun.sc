def only_parentheses(chars: List[Char]): List[Char] =
  chars.filter(is_parentheses)

def is_parentheses(c: Char): Boolean =
  if (c == '(' || c == ')') true else false




is_parentheses('(')
is_parentheses(')')
is_parentheses('f')

only_parentheses("abc")