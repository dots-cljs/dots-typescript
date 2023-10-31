(ns dots.typescript.custom-transformers)

(defn before
  "Custom transformers to evaluate before built-in .js transformations."
  ^js [custom-transformers]
  (.-before ^js custom-transformers))

(defn set-before!
  "Custom transformers to evaluate before built-in .js transformations."
  ^js [custom-transformers value]
  (set! (.-before ^js custom-transformers) value))

(defn after
  "Custom transformers to evaluate after built-in .js transformations."
  ^js [custom-transformers]
  (.-after ^js custom-transformers))

(defn set-after!
  "Custom transformers to evaluate after built-in .js transformations."
  ^js [custom-transformers value]
  (set! (.-after ^js custom-transformers) value))

(defn after-declarations
  "Custom transformers to evaluate after built-in .d.ts transformations."
  ^js [custom-transformers]
  (.-afterDeclarations ^js custom-transformers))

(defn set-after-declarations!
  "Custom transformers to evaluate after built-in .d.ts transformations."
  ^js [custom-transformers value]
  (set! (.-afterDeclarations ^js custom-transformers) value))
