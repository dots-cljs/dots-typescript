(ns dots.typescript.template-tail)

(defn kind
  ^js [template-tail]
  (.-kind ^js template-tail))

(defn parent
  ^js [template-tail]
  (.-parent ^js template-tail))

(defn raw-text
  ^js [template-tail]
  (.-rawText ^js template-tail))

(defn set-raw-text!
  ^js [template-tail value]
  (set! (.-rawText ^js template-tail) value))

(defn text
  ^js [template-tail]
  (.-text ^js template-tail))

(defn set-text!
  ^js [template-tail value]
  (set! (.-text ^js template-tail) value))

(defn unterminated?
  ^js [template-tail]
  (.-isUnterminated ^js template-tail))

(defn set-is-unterminated!
  ^js [template-tail value]
  (set! (.-isUnterminated ^js template-tail) value))

(defn has-extended-unicode-escape?
  ^js [template-tail]
  (.-hasExtendedUnicodeEscape ^js template-tail))

(defn set-has-extended-unicode-escape!
  ^js [template-tail value]
  (set! (.-hasExtendedUnicodeEscape ^js template-tail) value))

(defn flags
  ^js [template-tail]
  (.-flags ^js template-tail))

(defn source-file
  ^js [template-tail]
  (.getSourceFile ^js template-tail))

(defn child-count
  (^js [template-tail]
   (.getChildCount ^js template-tail))
  (^js [template-tail source-file]
   (.getChildCount ^js template-tail source-file)))

(defn child-at
  (^js [template-tail index]
   (.getChildAt ^js template-tail index))
  (^js [template-tail index source-file]
   (.getChildAt ^js template-tail index source-file)))

(defn children
  (^js [template-tail]
   (.getChildren ^js template-tail))
  (^js [template-tail source-file]
   (.getChildren ^js template-tail source-file)))

(defn start
  (^js [template-tail]
   (.getStart ^js template-tail))
  (^js [template-tail source-file]
   (.getStart ^js template-tail source-file))
  (^js [template-tail source-file include-js-doc-comment?]
   (.getStart ^js template-tail source-file include-js-doc-comment?)))

(defn full-start
  ^js [template-tail]
  (.getFullStart ^js template-tail))

(defn get-end
  ^js [template-tail]
  (.getEnd ^js template-tail))

(defn width
  (^js [template-tail]
   (.getWidth ^js template-tail))
  (^js [template-tail source-file]
   (.getWidth ^js template-tail source-file)))

(defn full-width
  ^js [template-tail]
  (.getFullWidth ^js template-tail))

(defn leading-trivia-width
  (^js [template-tail]
   (.getLeadingTriviaWidth ^js template-tail))
  (^js [template-tail source-file]
   (.getLeadingTriviaWidth ^js template-tail source-file)))

(defn full-text
  (^js [template-tail]
   (.getFullText ^js template-tail))
  (^js [template-tail source-file]
   (.getFullText ^js template-tail source-file)))

(defn get-text
  (^js [template-tail]
   (.getText ^js template-tail))
  (^js [template-tail source-file]
   (.getText ^js template-tail source-file)))

(defn first-token
  (^js [template-tail]
   (.getFirstToken ^js template-tail))
  (^js [template-tail source-file]
   (.getFirstToken ^js template-tail source-file)))

(defn last-token
  (^js [template-tail]
   (.getLastToken ^js template-tail))
  (^js [template-tail source-file]
   (.getLastToken ^js template-tail source-file)))

(defn for-each-child
  (^js [template-tail cb-node]
   (.forEachChild ^js template-tail cb-node))
  (^js [template-tail cb-node cb-node-array]
   (.forEachChild ^js template-tail cb-node cb-node-array)))

(defn decorators
  ^js [template-tail]
  (.-decorators ^js template-tail))

(defn modifiers
  ^js [template-tail]
  (.-modifiers ^js template-tail))

(defn pos
  ^js [template-tail]
  (.-pos ^js template-tail))

(defn end
  ^js [template-tail]
  (.-end ^js template-tail))
