import { expect, test } from "bun:test";
import { queueTime } from "./supermarket-queue";

test("queue Time", () => {
  expect(queueTime([], 1)).toBe(0);
  expect(queueTime([1, 2, 3, 4], 1)).toBe(10);
  expect(queueTime([5, 3, 4], 1)).toBe(12);
  expect(queueTime([10, 2, 3, 3], 2)).toBe(10);
  expect(queueTime([2, 3, 10, 2], 2)).toBe(12);
  expect(queueTime([2, 2, 3, 3, 4, 4], 2)).toBe(9);
  expect(queueTime([1, 2, 3, 4, 5], 100)).toBe(5);
  expect(queueTime([1, 2, 3, 4, 5], 3)).toBe(7);
});
