(ns dots.typescript.template-head)

(defn kind
  ^js [template-head]
  (.-kind ^js template-head))

(defn parent
  ^js [template-head]
  (.-parent ^js template-head))

(defn raw-text
  ^js [template-head]
  (.-rawText ^js template-head))

(defn set-raw-text!
  ^js [template-head value]
  (set! (.-rawText ^js template-head) value))

(defn text
  ^js [template-head]
  (.-text ^js template-head))

(defn set-text!
  ^js [template-head value]
  (set! (.-text ^js template-head) value))

(defn unterminated?
  ^js [template-head]
  (.-isUnterminated ^js template-head))

(defn set-is-unterminated!
  ^js [template-head value]
  (set! (.-isUnterminated ^js template-head) value))

(defn has-extended-unicode-escape?
  ^js [template-head]
  (.-hasExtendedUnicodeEscape ^js template-head))

(defn set-has-extended-unicode-escape!
  ^js [template-head value]
  (set! (.-hasExtendedUnicodeEscape ^js template-head) value))

(defn flags
  ^js [template-head]
  (.-flags ^js template-head))

(defn source-file
  ^js [template-head]
  (.getSourceFile ^js template-head))

(defn child-count
  (^js [template-head]
   (.getChildCount ^js template-head))
  (^js [template-head source-file]
   (.getChildCount ^js template-head source-file)))

(defn child-at
  (^js [template-head index]
   (.getChildAt ^js template-head index))
  (^js [template-head index source-file]
   (.getChildAt ^js template-head index source-file)))

(defn children
  (^js [template-head]
   (.getChildren ^js template-head))
  (^js [template-head source-file]
   (.getChildren ^js template-head source-file)))

(defn start
  (^js [template-head]
   (.getStart ^js template-head))
  (^js [template-head source-file]
   (.getStart ^js template-head source-file))
  (^js [template-head source-file include-js-doc-comment?]
   (.getStart ^js template-head source-file include-js-doc-comment?)))

(defn full-start
  ^js [template-head]
  (.getFullStart ^js template-head))

(defn get-end
  ^js [template-head]
  (.getEnd ^js template-head))

(defn width
  (^js [template-head]
   (.getWidth ^js template-head))
  (^js [template-head source-file]
   (.getWidth ^js template-head source-file)))

(defn full-width
  ^js [template-head]
  (.getFullWidth ^js template-head))

(defn leading-trivia-width
  (^js [template-head]
   (.getLeadingTriviaWidth ^js template-head))
  (^js [template-head source-file]
   (.getLeadingTriviaWidth ^js template-head source-file)))

(defn full-text
  (^js [template-head]
   (.getFullText ^js template-head))
  (^js [template-head source-file]
   (.getFullText ^js template-head source-file)))

(defn get-text
  (^js [template-head]
   (.getText ^js template-head))
  (^js [template-head source-file]
   (.getText ^js template-head source-file)))

(defn first-token
  (^js [template-head]
   (.getFirstToken ^js template-head))
  (^js [template-head source-file]
   (.getFirstToken ^js template-head source-file)))

(defn last-token
  (^js [template-head]
   (.getLastToken ^js template-head))
  (^js [template-head source-file]
   (.getLastToken ^js template-head source-file)))

(defn for-each-child
  (^js [template-head cb-node]
   (.forEachChild ^js template-head cb-node))
  (^js [template-head cb-node cb-node-array]
   (.forEachChild ^js template-head cb-node cb-node-array)))

(defn decorators
  ^js [template-head]
  (.-decorators ^js template-head))

(defn modifiers
  ^js [template-head]
  (.-modifiers ^js template-head))

(defn pos
  ^js [template-head]
  (.-pos ^js template-head))

(defn end
  ^js [template-head]
  (.-end ^js template-head))
