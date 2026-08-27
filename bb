The app is already installed and running on the REAL iPhone.

This is NOT an Xcode installation problem anymore.

Do NOT assume anything.

I want a COMPLETE technical investigation.

Treat this as a full debugging session.

Your job is to inspect every layer from start to finish until every native control works correctly.

========================
CHECK EVERYTHING
========================

1. SwiftUI layer
- Verify every button actually receives touch events.
- Verify hit-testing.
- Verify gestures.
- Verify button actions.

2. Native Overlay
- Make sure transparent areas pass touches to the WebView.
- Make sure controls themselves receive touches correctly.
- Verify there are no invisible views blocking taps.

3. Native → React bridge
Inspect every event.

Verify:
- Menu event
- AI selector event
- New Chat event
- Plus event
- Microphone event
- Send event

Make sure every event is actually emitted.

4. React listeners

Verify every listener:

- is registered
- is alive
- is not removed unexpectedly
- receives native events
- executes the existing handlers

5. React state

Verify synchronization:

Native
↓

Bridge
↓

React

↓

UI updates

and

React

↓

Native

There must be no stale state.

6. Event names

Check every emitted event.

Make sure:

Swift event name

==

React listener name

Check spelling.

Check payload.

Check timing.

7. Timing issues

Verify React is fully initialized before native events are sent.

Prevent events from being lost during startup.

8. Duplicate protection

Verify no event suppression is preventing normal taps.

Verify double-send protection is not blocking the first send.

9. AI selector

Verify:

tap

↓

menu opens

↓

selection changes

↓

React updates

↓

native updates

10. Menu

Verify the native button opens the existing React menu.

11. New Chat

Verify the existing New Chat action is triggered.

12. Input

Verify typing updates React correctly.

13. Send

Verify:

tap

↓

React handler

↓

message added

↓

API request

↓

response

↓

UI updates

14. Plus

Verify attachment menu opens.

15. Microphone

Verify voice flow starts.

16. Build

Run:

- web build
- Capacitor sync
- Xcode compile
- install to the connected REAL iPhone
- real device testing

Do NOT stop after compilation.

Actually test every control.

========================
IF YOU FIND ANY BUG
========================

Fix it immediately.

Do not wait for approval.

Small bug?

Fix it.

Race condition?

Fix it.

Listener issue?

Fix it.

Bridge issue?

Fix it.

State issue?

Fix it.

Overlay issue?

Fix it.

========================
FINAL REPORT
========================

When finished, provide a complete report.

For EVERY issue include:

- What was wrong
- Why it happened
- How you fixed it
- Files changed
- Whether it was tested on the real iPhone
- Result after testing

Also report anything suspicious even if it was not causing today's issue.

Do not push broken code.

Only commit and push after every native control works correctly on the real iPhone.

The visual design is already approved.

DO NOT change any visual styling.

Only fix functionality and stability.