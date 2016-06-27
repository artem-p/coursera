def only_parentheses(chars: List[Char]): List[Char] =
  chars.filter(is_parentheses)

def is_parentheses(c: Char): Boolean =
  if (c == '(' || c == ')') true else false
//
//def rem_outer_chars(chars: List[Char]): List[Char] =
//  chars.tail.reverse.tail
//
//def is_balanced(pars: List[Char]): Boolean =
//  if (pars.length % 2 != 0)
//    false
//  else
//    if (pars.isEmpty)
//      true
//    else
//      is_balanced(rem_outer_chars(pars))
//
//
is_parentheses('(')
is_parentheses(')')
is_parentheses('f')

only_parentheses(List('a', 'b', 'c'))
only_parentheses(List('(', 'a', 'b', 'c', ')'))
//
//rem_outer_chars(List('a', 'b', 'c'))
//
//is_balanced(List('a', 'b', 'c'))
//is_balanced(List('a', 'b'))
////if(chars.head == '(' || chars.last == ')')

def count_pars(pars: List[Char]): Int =
  // returns +1 when first par is "(" and -1 when ")"
  if (pars.nonEmpty)
    if (pars.head == '(') 1
    else -1
  else 0


count_pars(List('('))
count_pars(List(')'))
count_pars(List('(', ')'))

def is_balanced(pars: List[Char], numOpen: Int): Boolean =
  if (pars.isEmpty)
    if (numOpen == 0) true else false
  else {
    val nowOpen = numOpen + count_pars(pars)
    is_balanced(pars.tail, nowOpen)
  }

is_balanced(List('(', ')'), 0)
is_balanced(List('('), 0)
is_balanced(List(')'), 0)
is_balanced(List('(', ')', ')'), 0)
is_balanced(List('(', ')', '(', ')'), 0)
is_balanced(List('(', ')', '(', ')', ')'), 0)
is_balanced(List('(', '(', ')', '(', ')', ')'), 0)
