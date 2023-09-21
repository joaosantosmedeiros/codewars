import { expect, test } from "bun:test";
const { decodeMorse } = require('./morse-code')

test("decodeMorse", () => {
  expect(decodeMorse('.... . -.--   .--- ..- -.. .')).toBe('HEY JUDE');
  expect(decodeMorse('   .... . -.--   ')).toBe('HEY');
  expect(decodeMorse('      ...---... -.-.--   - .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-   .--- ..- -- .--. ...   --- ...- . .-.   - .... .   .-.. .- --.. -.--   -.. --- --. .-.-.-  ')).toBe('SOS! THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.');
});
