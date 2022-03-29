# 🎉️ 二叉树的遍历

## 二叉树的前序遍历

> 给你个二叉树的根节点 `root`,返回它的节点值的 **前序** 遍历。

示例 1：

~~~markdown
1
 \
  2
 /
3
~~~

```markdown
输入：root = [1,null,2,3]
输出：[1,2,3]
```

示例 2：

```markdown
输入：root = []
输出：[]
```

示例 3：

```markdown
输入：root = [1]
输出：[1]
```

示例 4：

~~~markdown
  1
 /
2
~~~

~~~markdown
输入：root = [1,2]
输出：[1,2]
~~~

示例 5：

~~~markdown
1
 \
  2
~~~

~~~markdown
输入：root = [1,null,2]
输出：[1,2]
~~~

### 方法1：递归

#### 思路与算法

树结构的本身就适合用于递归遍历，每一个节点。当节点不等于 `null` 时依次先遍历树中的 $left$ 子节点，后遍历 $right$ 子节点。直到子节点的下一个节点指向 `null` 结束递归。

~~~java
/**
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {
 *     }
 *     TreeNode(int val) {
 *         this.val = val;
 *     }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        traversal(root.left);
        traversal(root.right);
    }
}
~~~

#### 复杂度分析

- 时间复杂度：$O(n)$ $n$ 代表每个节点，操作的时间与树节点的长度有关，每个关节点都会被访问一次。
- 空间复杂度：$O(1)$ 没有用到树节点额外空间

### 方法二：迭代

#### 思路与算法

我们可以维护一个栈来迭代的方式实现递归，两种操作方式是等价的。

- 当前节点`[]`
- res:`[]`

```markdown
     1           --
   /   \        ｜ ｜
  2     3       ｜ ｜
 / \   /        ｜ ｜
4   5 6         ｜ ｜
                 --
                stack 
```

- 当前节点`[1]`
- res:`[1]`

```markdown
    [1]          --
   /   \        ｜ ｜
  2     3       ｜ ｜
 / \   /        ｜ ｜
4   5 6         ｜1｜
                 --
                stack
```

- 当前节点`[2]`
- res:`[1,2]`

```markdown
     1           --
   /   \        ｜ ｜
 [2]    3       ｜ ｜
 / \   /        ｜2｜
4   5 6         ｜1｜
                 --
                stack
```

- 当前节点`[4]`
- res:`[1,2,4]`

```markdown
      1           --
    /   \        ｜ ｜
   2     3       ｜4｜
  / \   /        ｜2｜
[4]  5 6         ｜1｜
                  --
                 stack
```

- 当前节点`[4]`
- res:`[1,2,4]`

```markdown
      1            4
    /   \        ｜ ｜
   2     3       ｜ ｜
  / \   /        ｜2｜
[4]  5 6         ｜1｜
                  --
                 stack
```

- 当前节点`[2]`
- res:`[1,2,4]`

```markdown
      1            2
    /   \        ｜ ｜
  [2]    3       ｜ ｜
  / \   /        ｜ ｜
 4   5 6         ｜1｜
                  --
                 stack
```

- 当前节点`[5]`
- res:`[1,2,4,5]`

```markdown
      1           --
    /   \        ｜ ｜
   2     3       ｜ ｜
  / \   /        ｜5｜
 4  [5]6         ｜1｜
                  --
                 stack
```

- 当前节点`[5]`
- res:`[1,2,4,5]`

```markdown
      1            5
    /   \        ｜ ｜
   2     3       ｜ ｜
  / \   /        ｜ ｜
 4  [5]6         ｜1｜
                  --
                 stack
```

- 当前节点`[1]`
- res:`[1,2,4,5]`

```markdown
     [1]           1
    /   \        ｜ ｜
   2     3       ｜ ｜
  / \   /        ｜ ｜
 4   5 6         ｜ ｜
                  --
                 stack
```

- 当前节点`[3]`
- res:`[1,2,4,5,3]`

```markdown
      1           --
    /   \        ｜ ｜
   2    [3]      ｜ ｜
  / \   /        ｜ ｜
 4   5 6         ｜3｜
                  --
                 stack
```

- 当前节点`[6]`
- res:`[1,2,4,5,3,6]`

```markdown
      1           --
    /   \        ｜ ｜
   2     3       ｜ ｜
  / \   /        ｜6｜
 4   5[6]        ｜3｜
                  --
                 stack
```

- 当前节点`[6]`
- res:`[1,2,4,5,3,6]`

```markdown
      1            6
    /   \        ｜ ｜
   2     3       ｜ ｜
  / \   /        ｜ ｜
 4   5[6]        ｜3｜
                  --
                 stack
```

- 当前节点`[3]`
- res:`[1,2,4,5,3,6]`

```markdown
      1            3
    /   \        ｜ ｜
   2    [3]      ｜ ｜
  / \   /        ｜ ｜
 4   5 6         ｜ ｜
                  --
                 stack
```

> 当 `stack` 和 `root` 不等于 **null** 不成立，结束 `while` ♻️ 返回 $res$

~~~java
/**
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {
 *     }
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return res;
    }
}
~~~

#### 复杂度分析

- 时间复杂度：$O(n)$ $n$ 代表每个节点，操作的时间与树节点的长度有关，每个关节点都会被访问一次。
- 空间复杂度：$O(n)$ $n$ 代表迭代过程中栈的开销。

## 二叉树的广度搜索

> 给你一个二叉树的根节点 `root` ，返回其节点的 **层序遍历**。（即逐层地，从左到右访问所以节点）。

示例 1：

~~~markdown
  3
 / \
9  20
   / \
  15  7
~~~

~~~markdown
输入：root = [3,9,20,null,null,15,7]
输出：[[3],[9,20],[15,7]]
~~~

示例 2：

~~~markdown
输入：root = [1]
输出：[[1]]
~~~

示例 3：

~~~markdown
输入：root = []
输出：[]
~~~

#### 方法 1：广度优先搜索

##### 思路与代码

~~~java
class Solution {
   
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int n = queue.size();
            for (int i = 1; i <= n; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(levl);
        }
  
         return res;
    }

}
~~~

##### 复杂度分析

- 时间复杂度：$O(n)$ 每个子节点进出队列各一次，子节点个数为 $n$
- 空间复杂度：$O(n)$ 队列中的元素为 $n$