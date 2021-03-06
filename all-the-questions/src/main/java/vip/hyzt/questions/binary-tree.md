# ðï¸ äºåæ çéå

## äºåæ çååºéå

> ç»ä½ ä¸ªäºåæ çæ ¹èç¹ `root`,è¿åå®çèç¹å¼ç **ååº** éåã

ç¤ºä¾ 1ï¼

~~~markdown
1
 \
  2
 /
3
~~~

```markdown
è¾å¥ï¼root = [1,null,2,3]
è¾åºï¼[1,2,3]
```

ç¤ºä¾ 2ï¼

```markdown
è¾å¥ï¼root = []
è¾åºï¼[]
```

ç¤ºä¾ 3ï¼

```markdown
è¾å¥ï¼root = [1]
è¾åºï¼[1]
```

ç¤ºä¾ 4ï¼

~~~markdown
  1
 /
2
~~~

~~~markdown
è¾å¥ï¼root = [1,2]
è¾åºï¼[1,2]
~~~

ç¤ºä¾ 5ï¼

~~~markdown
1
 \
  2
~~~

~~~markdown
è¾å¥ï¼root = [1,null,2]
è¾åºï¼[1,2]
~~~

### æ¹æ³1ï¼éå½

#### æè·¯ä¸ç®æ³

æ ç»æçæ¬èº«å°±éåç¨äºéå½éåï¼æ¯ä¸ä¸ªèç¹ãå½èç¹ä¸ç­äº `null` æ¶ä¾æ¬¡åéåæ ä¸­ç $left$ å­èç¹ï¼åéå $right$ å­èç¹ãç´å°å­èç¹çä¸ä¸ä¸ªèç¹æå `null` ç»æéå½ã

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

#### å¤æåº¦åæ

- æ¶é´å¤æåº¦ï¼$O(n)$ $n$ ä»£è¡¨æ¯ä¸ªèç¹ï¼æä½çæ¶é´ä¸æ èç¹çé¿åº¦æå³ï¼æ¯ä¸ªå³èç¹é½ä¼è¢«è®¿é®ä¸æ¬¡ã
- ç©ºé´å¤æåº¦ï¼$O(1)$ æ²¡æç¨å°æ èç¹é¢å¤ç©ºé´

### æ¹æ³äºï¼è¿­ä»£

#### æè·¯ä¸ç®æ³

æä»¬å¯ä»¥ç»´æ¤ä¸ä¸ªæ æ¥è¿­ä»£çæ¹å¼å®ç°éå½ï¼ä¸¤ç§æä½æ¹å¼æ¯ç­ä»·çã

- å½åèç¹`[]`
- res:`[]`

```markdown
     1           --
   /   \        ï½ ï½
  2     3       ï½ ï½
 / \   /        ï½ ï½
4   5 6         ï½ ï½
                 --
                stack 
```

- å½åèç¹`[1]`
- res:`[1]`

```markdown
    [1]          --
   /   \        ï½ ï½
  2     3       ï½ ï½
 / \   /        ï½ ï½
4   5 6         ï½1ï½
                 --
                stack
```

- å½åèç¹`[2]`
- res:`[1,2]`

```markdown
     1           --
   /   \        ï½ ï½
 [2]    3       ï½ ï½
 / \   /        ï½2ï½
4   5 6         ï½1ï½
                 --
                stack
```

- å½åèç¹`[4]`
- res:`[1,2,4]`

```markdown
      1           --
    /   \        ï½ ï½
   2     3       ï½4ï½
  / \   /        ï½2ï½
[4]  5 6         ï½1ï½
                  --
                 stack
```

- å½åèç¹`[4]`
- res:`[1,2,4]`

```markdown
      1            4
    /   \        ï½ ï½
   2     3       ï½ ï½
  / \   /        ï½2ï½
[4]  5 6         ï½1ï½
                  --
                 stack
```

- å½åèç¹`[2]`
- res:`[1,2,4]`

```markdown
      1            2
    /   \        ï½ ï½
  [2]    3       ï½ ï½
  / \   /        ï½ ï½
 4   5 6         ï½1ï½
                  --
                 stack
```

- å½åèç¹`[5]`
- res:`[1,2,4,5]`

```markdown
      1           --
    /   \        ï½ ï½
   2     3       ï½ ï½
  / \   /        ï½5ï½
 4  [5]6         ï½1ï½
                  --
                 stack
```

- å½åèç¹`[5]`
- res:`[1,2,4,5]`

```markdown
      1            5
    /   \        ï½ ï½
   2     3       ï½ ï½
  / \   /        ï½ ï½
 4  [5]6         ï½1ï½
                  --
                 stack
```

- å½åèç¹`[1]`
- res:`[1,2,4,5]`

```markdown
     [1]           1
    /   \        ï½ ï½
   2     3       ï½ ï½
  / \   /        ï½ ï½
 4   5 6         ï½ ï½
                  --
                 stack
```

- å½åèç¹`[3]`
- res:`[1,2,4,5,3]`

```markdown
      1           --
    /   \        ï½ ï½
   2    [3]      ï½ ï½
  / \   /        ï½ ï½
 4   5 6         ï½3ï½
                  --
                 stack
```

- å½åèç¹`[6]`
- res:`[1,2,4,5,3,6]`

```markdown
      1           --
    /   \        ï½ ï½
   2     3       ï½ ï½
  / \   /        ï½6ï½
 4   5[6]        ï½3ï½
                  --
                 stack
```

- å½åèç¹`[6]`
- res:`[1,2,4,5,3,6]`

```markdown
      1            6
    /   \        ï½ ï½
   2     3       ï½ ï½
  / \   /        ï½ ï½
 4   5[6]        ï½3ï½
                  --
                 stack
```

- å½åèç¹`[3]`
- res:`[1,2,4,5,3,6]`

```markdown
      1            3
    /   \        ï½ ï½
   2    [3]      ï½ ï½
  / \   /        ï½ ï½
 4   5 6         ï½ ï½
                  --
                 stack
```

> å½ `stack` å `root` ä¸ç­äº **null** ä¸æç«ï¼ç»æ `while` â»ï¸ è¿å $res$

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

#### å¤æåº¦åæ

- æ¶é´å¤æåº¦ï¼$O(n)$ $n$ ä»£è¡¨æ¯ä¸ªèç¹ï¼æä½çæ¶é´ä¸æ èç¹çé¿åº¦æå³ï¼æ¯ä¸ªå³èç¹é½ä¼è¢«è®¿é®ä¸æ¬¡ã
- ç©ºé´å¤æåº¦ï¼$O(n)$ $n$ ä»£è¡¨è¿­ä»£è¿ç¨ä¸­æ çå¼éã

## äºåæ çå¹¿åº¦æç´¢

> ç»ä½ ä¸ä¸ªäºåæ çæ ¹èç¹ `root` ï¼è¿åå¶èç¹ç **å±åºéå**ãï¼å³éå±å°ï¼ä»å·¦å°å³è®¿é®æä»¥èç¹ï¼ã

ç¤ºä¾ 1ï¼

~~~markdown
  3
 / \
9  20
   / \
  15  7
~~~

~~~markdown
è¾å¥ï¼root = [3,9,20,null,null,15,7]
è¾åºï¼[[3],[9,20],[15,7]]
~~~

ç¤ºä¾ 2ï¼

~~~markdown
è¾å¥ï¼root = [1]
è¾åºï¼[[1]]
~~~

ç¤ºä¾ 3ï¼

~~~markdown
è¾å¥ï¼root = []
è¾åºï¼[]
~~~

#### æ¹æ³ 1ï¼å¹¿åº¦ä¼åæç´¢

##### æè·¯ä¸ä»£ç 

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

##### å¤æåº¦åæ

- æ¶é´å¤æåº¦ï¼$O(n)$ æ¯ä¸ªå­èç¹è¿åºéååä¸æ¬¡ï¼å­èç¹ä¸ªæ°ä¸º $n$
- ç©ºé´å¤æåº¦ï¼$O(n)$ éåä¸­çåç´ ä¸º $n$