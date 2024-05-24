(ns dots.typescript.server.file-stats)

(defn js
  ^js [file-stats]
  (.-js ^js file-stats))

(defn js-size
  ^js [file-stats]
  (.-jsSize ^js file-stats))

(defn jsx
  ^js [file-stats]
  (.-jsx ^js file-stats))

(defn jsx-size
  ^js [file-stats]
  (.-jsxSize ^js file-stats))

(defn ts
  ^js [file-stats]
  (.-ts ^js file-stats))

(defn ts-size
  ^js [file-stats]
  (.-tsSize ^js file-stats))

(defn tsx
  ^js [file-stats]
  (.-tsx ^js file-stats))

(defn tsx-size
  ^js [file-stats]
  (.-tsxSize ^js file-stats))

(defn dts
  ^js [file-stats]
  (.-dts ^js file-stats))

(defn dts-size
  ^js [file-stats]
  (.-dtsSize ^js file-stats))

(defn deferred
  ^js [file-stats]
  (.-deferred ^js file-stats))

(defn deferred-size
  ^js [file-stats]
  (.-deferredSize ^js file-stats))
