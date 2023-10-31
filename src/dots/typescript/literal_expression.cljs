(ns dots.typescript.literal-expression)

(defn text
  ^js [literal-expression]
  (.-text ^js literal-expression))

(defn set-text!
  ^js [literal-expression value]
  (set! (.-text ^js literal-expression) value))

(defn unterminated?
  ^js [literal-expression]
  (.-isUnterminated ^js literal-expression))

(defn set-is-unterminated!
  ^js [literal-expression value]
  (set! (.-isUnterminated ^js literal-expression) value))

(defn has-extended-unicode-escape?
  ^js [literal-expression]
  (.-hasExtendedUnicodeEscape ^js literal-expression))

(defn set-has-extended-unicode-escape!
  ^js [literal-expression value]
  (set! (.-hasExtendedUnicodeEscape ^js literal-expression) value))

(defn kind
  ^js [literal-expression]
  (.-kind ^js literal-expression))

(defn flags
  ^js [literal-expression]
  (.-flags ^js literal-expression))

(defn parent
  ^js [literal-expression]
  (.-parent ^js literal-expression))

(defn source-file
  ^js [literal-expression]
  (.getSourceFile ^js literal-expression))

(defn child-count
  (^js [literal-expression]
   (.getChildCount ^js literal-expression))
  (^js [literal-expression source-file]
   (.getChildCount ^js literal-expression source-file)))

(defn child-at
  (^js [literal-expression index]
   (.getChildAt ^js literal-expression index))
  (^js [literal-expression index source-file]
   (.getChildAt ^js literal-expression index source-file)))

(defn children
  (^js [literal-expression]
   (.getChildren ^js literal-expression))
  (^js [literal-expression source-file]
   (.getChildren ^js literal-expression source-file)))

(defn start
  (^js [literal-expression]
   (.getStart ^js literal-expression))
  (^js [literal-expression source-file]
   (.getStart ^js literal-expression source-file))
  (^js [literal-expression source-file include-js-doc-comment?]
   (.getStart ^js literal-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [literal-expression]
  (.getFullStart ^js literal-expression))

(defn get-end
  ^js [literal-expression]
  (.getEnd ^js literal-expression))

(defn width
  (^js [literal-expression]
   (.getWidth ^js literal-expression))
  (^js [literal-expression source-file]
   (.getWidth ^js literal-expression source-file)))

(defn full-width
  ^js [literal-expression]
  (.getFullWidth ^js literal-expression))

(defn leading-trivia-width
  (^js [literal-expression]
   (.getLeadingTriviaWidth ^js literal-expression))
  (^js [literal-expression source-file]
   (.getLeadingTriviaWidth ^js literal-expression source-file)))

(defn full-text
  (^js [literal-expression]
   (.getFullText ^js literal-expression))
  (^js [literal-expression source-file]
   (.getFullText ^js literal-expression source-file)))

(defn get-text
  (^js [literal-expression]
   (.getText ^js literal-expression))
  (^js [literal-expression source-file]
   (.getText ^js literal-expression source-file)))

(defn first-token
  (^js [literal-expression]
   (.getFirstToken ^js literal-expression))
  (^js [literal-expression source-file]
   (.getFirstToken ^js literal-expression source-file)))

(defn last-token
  (^js [literal-expression]
   (.getLastToken ^js literal-expression))
  (^js [literal-expression source-file]
   (.getLastToken ^js literal-expression source-file)))

(defn for-each-child
  (^js [literal-expression cb-node]
   (.forEachChild ^js literal-expression cb-node))
  (^js [literal-expression cb-node cb-node-array]
   (.forEachChild ^js literal-expression cb-node cb-node-array)))

(defn decorators
  ^js [literal-expression]
  (.-decorators ^js literal-expression))

(defn modifiers
  ^js [literal-expression]
  (.-modifiers ^js literal-expression))

(defn pos
  ^js [literal-expression]
  (.-pos ^js literal-expression))

(defn end
  ^js [literal-expression]
  (.-end ^js literal-expression))
