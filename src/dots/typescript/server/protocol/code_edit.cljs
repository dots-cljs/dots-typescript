(ns dots.typescript.server.protocol.code-edit
  "Object found in response messages defining an editing
   instruction for a span of text in source code.  The effect of
   this instruction is to replace the text starting at start and
   ending one character before end with newText. For an insertion,
   the text span is empty.  For a deletion, newText is empty.")

(defn start
  "First character of the text span to edit.
   
   **Returns:** `Location`"
  ^js [code-edit]
  (.-start ^js code-edit))

(defn set-start!
  "First character of the text span to edit."
  ^js [code-edit value]
  (set! (.-start ^js code-edit) value))

(defn end
  "One character past last character of the text span to edit.
   
   **Returns:** `Location`"
  ^js [code-edit]
  (.-end ^js code-edit))

(defn set-end!
  "One character past last character of the text span to edit."
  ^js [code-edit value]
  (set! (.-end ^js code-edit) value))

(defn new-text
  "Replace the span defined above with this string (may be
   the empty string).
   
   **Returns:** `string`"
  ^js [code-edit]
  (.-newText ^js code-edit))

(defn set-new-text!
  "Replace the span defined above with this string (may be
   the empty string)."
  ^js [code-edit value]
  (set! (.-newText ^js code-edit) value))
