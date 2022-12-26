package vip.hyzt.questions;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <h1>2512. 奖励最顶尖的 K 名学生</h1>
 * <p>给你两个字符串数组 positive_feedback 和 negative_feedback ，分别包含表示正面的和负面的词汇。<strong>不会</strong> 有单词同时是正面的和负面的。</p>
 * <p>一开始，每位学生分数为 0 。每个正面的单词会给学生的分数 <strong>加</strong> 3 分，每个负面的词会给学生的分数 <strong>减</strong>  1 分。</p>
 * <p>给你 n 个学生的评语，用一个下标从 <strong>0</strong> 开始的字符串数组 report 和一个下标从  <strong>0</strong> 开始的整数数组 student_id 表示，其中 student_id[i] 表示这名学生的 ID ，这名学生的评语是 report[i] 。每名学生的 ID <strong>互不相同</strong>。</p>
 * <p>给你一个整数 k ，请你返回按照得分 <strong>从高到低</strong> 最顶尖的 k 名学生。如果有多名学生分数相同，ID 越小排名越前。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：positive_feedback = ["smart","brilliant","studious"], negative_feedback = ["not"], report = ["this student is studious","the student is smart"], student_id = [1,2], k = 2
 *     输出：[1,2]
 *     解释：
 *     两名学生都有 1 个正面词汇，都得到 3 分，学生 1 的 ID 更小所以排名更前。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：positive_feedback = ["smart","brilliant","studious"], negative_feedback = ["not"], report = ["this student is not studious","the student is smart"], student_id = [1,2], k = 2
 *     输出：[2,1]
 *     解释：
 *     - ID 为 1 的学生有 1 个正面词汇和 1 个负面词汇，所以得分为 3-1=2 分。
 *     - ID 为 2 的学生有 1 个正面词汇，得分为 3 分。
 *     学生 2 分数更高，所以返回 [2,1] 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= positive_feedback.length, negative_feedback.length <= 10<sup>4</sup></li>
 *     <li>1 <= positive_feedback[i].length, negative_feedback[j].length <= 100</li>
 *     <li>positive_feedback[i] 和 negative_feedback[j] 都只包含小写英文字母。</li>
 *     <li>positive_feedback 和 negative_feedback 中不会有相同单词。</li>
 *     <li>n == report.length == student_id.length</li>
 *     <li>1 <= n <= 10<sup>4</sup></li>
 *     <li>report[i] 只包含小写英文字母和空格 ' ' 。</li>
 *     <li>report[i] 中连续单词之间有单个空格隔开。</li>
 *     <li>1 <= report[i].length <= 100</li>
 *     <li>1 <= student_id[i] <= 10<sup>9</sup></li>
 *     <li>student_id[i] 的值 <strong>互不相同</strong> 。</li>
 *     <li>1 <= k <= n</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/reward-top-k-students/description/">https://leetcode.cn/problems/reward-top-k-students/description/</a>
 */
public class Topic2512TopStudents {

    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        Set<String> positive = Set.of(positive_feedback), negative = Set.of(negative_feedback);
        int[] points = Stream.of(report).mapToInt(v -> Stream.of(v.split(" "))
                .mapToInt(w -> positive.contains(w) ? 3 : negative.contains(w) ? -1 : 0).sum()).toArray();
        return IntStream.range(0, report.length).boxed()
                .sorted((o, p) -> points[o] == points[p] ? student_id[o] - student_id[p] : points[p] - points[o])
                .map(t -> student_id[t]).limit(k).toList();

//        PriorityQueue<Student> queue = new PriorityQueue<>((o1, o2) -> {
//            if (o1.getScore() == o2.getScore()) {
//                return o1.getId() - o2.getId();
//            }
//            return o2.getScore() - o1.getScore();
//        });
//        Map<String, Integer> map = new HashMap<>();
//        for (String s : positive_feedback) {
//            map.put(s, 3);
//        }
//        for (String s : negative_feedback) {
//            map.put(s, -1);
//        }
//        for (int i = 0; i < report.length; i++) {
//            String s = report[i];
//            int score = 0;
//            for (String str : s.split(" ")) {
//                score += map.getOrDefault(str, 0);
//            }
//            queue.offer(new Student(student_id[i], score));
//        }
//        ArrayList<Integer> res = new ArrayList<>();
//        while (k > 0 && !queue.isEmpty()) {
//            res.add(queue.poll().getId());
//            k--;
//        }
//        return res;
    }

    static class Student {

        private int id;

        private int score;

        public Student(int id, int score) {
            this.id = id;
            this.score = score;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }

}
