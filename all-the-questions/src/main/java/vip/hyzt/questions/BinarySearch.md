## 二分查找

### 整体思路示例

- 使用到二分查找的数组中的元素前提是升序排列
- 声明一个名为 **size** 的变量，用来存储需要查找的数组长度
- **start** 变量为二分查找的起始位置，默认起始位置为 0
- **end** 变量为二分查找的终止位置，默认为查询数组长度减一
- `while` 条件当 `start <= end` 为 false 迭代查找 target
  - **middle** 为 数组中的中位下标，(end - start) 这样处理是为了防止 int 值溢出
  - 当 target 目标数等于中位数则返回该下标
  - 当 target 目标数小于中位数则更新二分查找的起始位置 end 为当前中位数减一
  - 否则更新二分查找的起始下标为当前中位数加一
  - 可自行脑补画面

- 当需要查找的目标数 target 为 3 时
- start 为 0，end 为 nums 数组长度减一 8 - 1 = 7;

#### 第一次 while迭代
- start(0) <= end(7) 为 false 进入 `while` 迭代;
- 中位下标为 start(0) + (7 - 0) / 2。**向下取整 middle 为 3**;
~~~
此时 middle(3) 指向数组元素当中的 6。 因此 middleNum = 6
 [1, 3, 4, 6, 7, 8, 10, 23]
  ↑        ↑             ↑
start(0) middle(3)     end(7)

target(3) 小于 middleNum(6)

end(2) = middle(3) - 1
~~~

#### 第二次 while 迭代
- start(0) <= end(2) 为 false 进入 `while` 迭代;
- 中位数下标为 start(0) + (2 - 0) / 2。**middle 为 1**;
~~~
[1,        3,        4]
 ↑         ↑         ↑
start(0) middle(1)  end(2)

target(3) == middleNum(3)

返回 middle(1)

结束 while 迭代
~~~
### 代码示例
~~~java
int target = 3;
int[] nums = new int[] {1, 3, 4, 6, 7, 8, 10, 23};

public static int bibarySearch(int[] nums, int target) {
    int size = nums.length - 1;
    int start = 0;
    int end = size;
    while(start <= end) {
        int middle = start + (end - start) / 2;
        int middleNum = nums[middle];
        if (target == middleNum) {
            return middle;
        }
        else if (target < middleNum) {
            end = middle - 1;
        }
        else {
            start = middle + 1;
        }
    }
    return -1;
}
~~~