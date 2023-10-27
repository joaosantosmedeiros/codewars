import { expect, test } from "bun:test";
import { cycle } from "./cycle";

test("cycle", () => {
  expect(cycle(-1, [1, 2, 3], 2)).toBe(1);
  expect(cycle(1, [1, 2, 3], 4)).toBe(null);
  expect(cycle(1, [1, 2, 3], 3)).toBe(1);
  expect(cycle(-1, [1, 2, 3], 1)).toBe(3);
  expect(cycle(1, [1, 2, 2, 3], 2)).toBe(2);
  expect(cycle(1, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11], 11)).toBe(1);
  expect(cycle(-1, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11], 1)).toBe(11);
  expect(cycle(-1, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11], 6)).toBe(5);
  expect(cycle(-1, [1, 2, 3, 4, 5, 6, 7, 8, 4, 10, 11], 4)).toBe(3);
  expect(cycle(1, [1, 2, 3, 4, 5, 6, 7, 8, 4, 10, 11], 7)).toBe(8);
});
