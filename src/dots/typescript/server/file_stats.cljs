(ns dots.typescript.server.file-stats)

(defn js
  "**Returns:** `number`"
  ^js [file-stats]
  (.-js ^js file-stats))

(defn js-size
  "**Returns:** `number | undefined`"
  ^js [file-stats]
  (.-jsSize ^js file-stats))

(defn jsx
  "**Returns:** `number`"
  ^js [file-stats]
  (.-jsx ^js file-stats))

(defn jsx-size
  "**Returns:** `number | undefined`"
  ^js [file-stats]
  (.-jsxSize ^js file-stats))

(defn ts
  "**Returns:** `number`"
  ^js [file-stats]
  (.-ts ^js file-stats))

(defn ts-size
  "**Returns:** `number | undefined`"
  ^js [file-stats]
  (.-tsSize ^js file-stats))

(defn tsx
  "**Returns:** `number`"
  ^js [file-stats]
  (.-tsx ^js file-stats))

(defn tsx-size
  "**Returns:** `number | undefined`"
  ^js [file-stats]
  (.-tsxSize ^js file-stats))

(defn dts
  "**Returns:** `number`"
  ^js [file-stats]
  (.-dts ^js file-stats))

(defn dts-size
  "**Returns:** `number | undefined`"
  ^js [file-stats]
  (.-dtsSize ^js file-stats))

(defn deferred
  "**Returns:** `number`"
  ^js [file-stats]
  (.-deferred ^js file-stats))

(defn deferred-size
  "**Returns:** `number | undefined`"
  ^js [file-stats]
  (.-deferredSize ^js file-stats))
